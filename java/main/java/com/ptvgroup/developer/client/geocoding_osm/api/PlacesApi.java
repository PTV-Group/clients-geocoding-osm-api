/*
 * Geocoding OSM
 * With the Geocoding OSM service places can be searched based on OSM data. The search is based on an address, text input or a geographical position.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.ptvgroup.developer.client.geocoding_osm.api;

import com.ptvgroup.developer.client.geocoding_osm.ApiClient;
import com.ptvgroup.developer.client.geocoding_osm.ApiException;
import com.ptvgroup.developer.client.geocoding_osm.ApiResponse;
import com.ptvgroup.developer.client.geocoding_osm.Pair;

import com.ptvgroup.developer.client.geocoding_osm.model.DetailLevel;
import com.ptvgroup.developer.client.geocoding_osm.model.ErrorResponse;
import com.ptvgroup.developer.client.geocoding_osm.model.PlacesSearchResult;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-25T14:36:44.155023Z[Etc/UTC]")
public class PlacesApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public PlacesApi() {
    this(new ApiClient());
  }

  public PlacesApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 
   * Searches for places based on a multi-field address input.
   * @param country The country in which the places should be searched. A country may be defined by name or ISO code (ISO 3166-1 alpha-2). (optional)
   * @param state A subdivision of a country, for example a state or a region. Using this field narrows down the search and reduces the number of possible results. (optional)
   * @param province A subdivision of a state, for example the province or county. Using this field narrows down the search and reduces the number of possible results. (optional)
   * @param locality The locality of the address, which may be a city, a district or subdistrict. (optional)
   * @param postalCode The postal code, or zip-code, which is used by a postal authority of a country to identify where the address is located. (optional)
   * @param street The name of the road where the address is located. It may contain a house number, but using the **houseNumber** field instead will lead to better results. (optional)
   * @param houseNumber The house number of the address. (optional)
   * @param languages A comma-separated list of preferred languages for the response, formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. These languages are ordered by decreasing priority. In case none of the given preferred languages is available in the data, the default language is used, which is the language spoken in the country or region of the result (optional
   * @return PlacesSearchResult
   * @throws ApiException if fails to make API call
   */
  public PlacesSearchResult searchPlacesByAddress(String country, String state, String province, String locality, String postalCode, String street, String houseNumber, List<String> languages) throws ApiException {
    ApiResponse<PlacesSearchResult> localVarResponse = searchPlacesByAddressWithHttpInfo(country, state, province, locality, postalCode, street, houseNumber, languages);
    return localVarResponse.getData();
  }

  /**
   * 
   * Searches for places based on a multi-field address input.
   * @param country The country in which the places should be searched. A country may be defined by name or ISO code (ISO 3166-1 alpha-2). (optional)
   * @param state A subdivision of a country, for example a state or a region. Using this field narrows down the search and reduces the number of possible results. (optional)
   * @param province A subdivision of a state, for example the province or county. Using this field narrows down the search and reduces the number of possible results. (optional)
   * @param locality The locality of the address, which may be a city, a district or subdistrict. (optional)
   * @param postalCode The postal code, or zip-code, which is used by a postal authority of a country to identify where the address is located. (optional)
   * @param street The name of the road where the address is located. It may contain a house number, but using the **houseNumber** field instead will lead to better results. (optional)
   * @param houseNumber The house number of the address. (optional)
   * @param languages A comma-separated list of preferred languages for the response, formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. These languages are ordered by decreasing priority. In case none of the given preferred languages is available in the data, the default language is used, which is the language spoken in the country or region of the result (optional
   * @return ApiResponse&lt;PlacesSearchResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PlacesSearchResult> searchPlacesByAddressWithHttpInfo(String country, String state, String province, String locality, String postalCode, String street, String houseNumber, List<String> languages) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = searchPlacesByAddressRequestBuilder(country, state, province, locality, postalCode, street, houseNumber, languages);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("searchPlacesByAddress", localVarResponse);
        }
        return new ApiResponse<PlacesSearchResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PlacesSearchResult>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder searchPlacesByAddressRequestBuilder(String country, String state, String province, String locality, String postalCode, String street, String houseNumber, List<String> languages) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/places/by-address";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "state";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("state", state));
    localVarQueryParameterBaseName = "province";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("province", province));
    localVarQueryParameterBaseName = "locality";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("locality", locality));
    localVarQueryParameterBaseName = "postalCode";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("postalCode", postalCode));
    localVarQueryParameterBaseName = "street";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("street", street));
    localVarQueryParameterBaseName = "houseNumber";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("houseNumber", houseNumber));
    localVarQueryParameterBaseName = "languages";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "languages", languages));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * 
   * Searches for places near a given geographical position.
   * @param latitude  (required)
   * @param longitude  (required)
   * @param detailLevel Detail level of the address. (optional)
   * @param languages A comma-separated list of preferred languages for the response, formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. These languages are ordered by decreasing priority. In case none of the given preferred languages is available in the data, the default language is used, which is the language spoken in the country or region of the result (optional
   * @return PlacesSearchResult
   * @throws ApiException if fails to make API call
   */
  public PlacesSearchResult searchPlacesByPosition(Double latitude, Double longitude, DetailLevel detailLevel, List<String> languages) throws ApiException {
    ApiResponse<PlacesSearchResult> localVarResponse = searchPlacesByPositionWithHttpInfo(latitude, longitude, detailLevel, languages);
    return localVarResponse.getData();
  }

  /**
   * 
   * Searches for places near a given geographical position.
   * @param latitude  (required)
   * @param longitude  (required)
   * @param detailLevel Detail level of the address. (optional)
   * @param languages A comma-separated list of preferred languages for the response, formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. These languages are ordered by decreasing priority. In case none of the given preferred languages is available in the data, the default language is used, which is the language spoken in the country or region of the result (optional
   * @return ApiResponse&lt;PlacesSearchResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PlacesSearchResult> searchPlacesByPositionWithHttpInfo(Double latitude, Double longitude, DetailLevel detailLevel, List<String> languages) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = searchPlacesByPositionRequestBuilder(latitude, longitude, detailLevel, languages);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("searchPlacesByPosition", localVarResponse);
        }
        return new ApiResponse<PlacesSearchResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PlacesSearchResult>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder searchPlacesByPositionRequestBuilder(Double latitude, Double longitude, DetailLevel detailLevel, List<String> languages) throws ApiException {
    // verify the required parameter 'latitude' is set
    if (latitude == null) {
      throw new ApiException(400, "Missing the required parameter 'latitude' when calling searchPlacesByPosition");
    }
    // verify the required parameter 'longitude' is set
    if (longitude == null) {
      throw new ApiException(400, "Missing the required parameter 'longitude' when calling searchPlacesByPosition");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/places/by-position/{latitude}/{longitude}"
        .replace("{latitude}", ApiClient.urlEncode(latitude.toString()))
        .replace("{longitude}", ApiClient.urlEncode(longitude.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "detailLevel";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("detailLevel", detailLevel));
    localVarQueryParameterBaseName = "languages";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "languages", languages));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * 
   * Searches for places based on a single-field text input.
   * @param searchText Free-form text input that describes a place. (required)
   * @param languages A comma-separated list of preferred languages for the response, formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. These languages are ordered by decreasing priority. In case none of the given preferred languages is available in the data, the default language is used, which is the language spoken in the country or region of the result (optional
   * @return PlacesSearchResult
   * @throws ApiException if fails to make API call
   */
  public PlacesSearchResult searchPlacesByText(String searchText, List<String> languages) throws ApiException {
    ApiResponse<PlacesSearchResult> localVarResponse = searchPlacesByTextWithHttpInfo(searchText, languages);
    return localVarResponse.getData();
  }

  /**
   * 
   * Searches for places based on a single-field text input.
   * @param searchText Free-form text input that describes a place. (required)
   * @param languages A comma-separated list of preferred languages for the response, formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. These languages are ordered by decreasing priority. In case none of the given preferred languages is available in the data, the default language is used, which is the language spoken in the country or region of the result (optional
   * @return ApiResponse&lt;PlacesSearchResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PlacesSearchResult> searchPlacesByTextWithHttpInfo(String searchText, List<String> languages) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = searchPlacesByTextRequestBuilder(searchText, languages);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("searchPlacesByText", localVarResponse);
        }
        return new ApiResponse<PlacesSearchResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PlacesSearchResult>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder searchPlacesByTextRequestBuilder(String searchText, List<String> languages) throws ApiException {
    // verify the required parameter 'searchText' is set
    if (searchText == null) {
      throw new ApiException(400, "Missing the required parameter 'searchText' when calling searchPlacesByText");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/places/by-text";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "searchText";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("searchText", searchText));
    localVarQueryParameterBaseName = "languages";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "languages", languages));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}

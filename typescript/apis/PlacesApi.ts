/* tslint:disable */
/* eslint-disable */
/**
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


import * as runtime from '../runtime';
import type {
  DetailLevel,
  ErrorResponse,
  PlacesSearchResult,
} from '../models/index';
import {
    DetailLevelFromJSON,
    DetailLevelToJSON,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    PlacesSearchResultFromJSON,
    PlacesSearchResultToJSON,
} from '../models/index';

export interface SearchPlacesByAddressRequest {
    country?: string;
    state?: string;
    province?: string;
    locality?: string;
    postalCode?: string;
    street?: string;
    houseNumber?: string;
    languages?: Array<string>;
}

export interface SearchPlacesByPositionRequest {
    latitude: number;
    longitude: number;
    detailLevel?: DetailLevel;
    languages?: Array<string>;
}

export interface SearchPlacesByTextRequest {
    searchText: string;
    languages?: Array<string>;
}

/**
 * 
 */
export class PlacesApi extends runtime.BaseAPI {

    /**
     * Searches for places based on a multi-field address input.
     */
    async searchPlacesByAddressRaw(requestParameters: SearchPlacesByAddressRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<PlacesSearchResult>> {
        const queryParameters: any = {};

        if (requestParameters['country'] != null) {
            queryParameters['country'] = requestParameters['country'];
        }

        if (requestParameters['state'] != null) {
            queryParameters['state'] = requestParameters['state'];
        }

        if (requestParameters['province'] != null) {
            queryParameters['province'] = requestParameters['province'];
        }

        if (requestParameters['locality'] != null) {
            queryParameters['locality'] = requestParameters['locality'];
        }

        if (requestParameters['postalCode'] != null) {
            queryParameters['postalCode'] = requestParameters['postalCode'];
        }

        if (requestParameters['street'] != null) {
            queryParameters['street'] = requestParameters['street'];
        }

        if (requestParameters['houseNumber'] != null) {
            queryParameters['houseNumber'] = requestParameters['houseNumber'];
        }

        if (requestParameters['languages'] != null) {
            queryParameters['languages'] = requestParameters['languages']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        const headerParameters: runtime.HTTPHeaders = {};
		headerParameters['User-Agent'] = "ptv-generated typescript client";

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/places/by-address`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PlacesSearchResultFromJSON(jsonValue));
    }

    /**
     * Searches for places based on a multi-field address input.
     */
    async searchPlacesByAddress(requestParameters: SearchPlacesByAddressRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<PlacesSearchResult> {
        const response = await this.searchPlacesByAddressRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Searches for places near a given geographical position.
     */
    async searchPlacesByPositionRaw(requestParameters: SearchPlacesByPositionRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<PlacesSearchResult>> {
        if (requestParameters['latitude'] == null) {
            throw new runtime.RequiredError(
                'latitude',
                'Required parameter "latitude" was null or undefined when calling searchPlacesByPosition().'
            );
        }

        if (requestParameters['longitude'] == null) {
            throw new runtime.RequiredError(
                'longitude',
                'Required parameter "longitude" was null or undefined when calling searchPlacesByPosition().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['detailLevel'] != null) {
            queryParameters['detailLevel'] = requestParameters['detailLevel'];
        }

        if (requestParameters['languages'] != null) {
            queryParameters['languages'] = requestParameters['languages']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        const headerParameters: runtime.HTTPHeaders = {};
		headerParameters['User-Agent'] = "ptv-generated typescript client";

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/places/by-position/{latitude}/{longitude}`.replace(`{${"latitude"}}`, encodeURIComponent(String(requestParameters['latitude']))).replace(`{${"longitude"}}`, encodeURIComponent(String(requestParameters['longitude']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PlacesSearchResultFromJSON(jsonValue));
    }

    /**
     * Searches for places near a given geographical position.
     */
    async searchPlacesByPosition(requestParameters: SearchPlacesByPositionRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<PlacesSearchResult> {
        const response = await this.searchPlacesByPositionRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Searches for places based on a single-field text input.
     */
    async searchPlacesByTextRaw(requestParameters: SearchPlacesByTextRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<PlacesSearchResult>> {
        if (requestParameters['searchText'] == null) {
            throw new runtime.RequiredError(
                'searchText',
                'Required parameter "searchText" was null or undefined when calling searchPlacesByText().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['searchText'] != null) {
            queryParameters['searchText'] = requestParameters['searchText'];
        }

        if (requestParameters['languages'] != null) {
            queryParameters['languages'] = requestParameters['languages']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        const headerParameters: runtime.HTTPHeaders = {};
		headerParameters['User-Agent'] = "ptv-generated typescript client";

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/places/by-text`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PlacesSearchResultFromJSON(jsonValue));
    }

    /**
     * Searches for places based on a single-field text input.
     */
    async searchPlacesByText(requestParameters: SearchPlacesByTextRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<PlacesSearchResult> {
        const response = await this.searchPlacesByTextRaw(requestParameters, initOverrides);
        return await response.value();
    }

}

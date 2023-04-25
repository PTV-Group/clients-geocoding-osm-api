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

import { exists, mapValues } from '../runtime';
import type { Place } from './Place';
import {
    PlaceFromJSON,
    PlaceFromJSONTyped,
    PlaceToJSON,
} from './Place';
import type { Warning } from './Warning';
import {
    WarningFromJSON,
    WarningFromJSONTyped,
    WarningToJSON,
} from './Warning';

/**
 * The result of a places search.
 * @export
 * @interface PlacesSearchResult
 */
export interface PlacesSearchResult {
    /**
     * The places which where found.
     * @type {Array<Place>}
     * @memberof PlacesSearchResult
     */
    places: Array<Place>;
    /**
     * A list of warnings concerning the validity of the result.
     * @type {Array<Warning>}
     * @memberof PlacesSearchResult
     */
    warnings?: Array<Warning>;
}

/**
 * Check if a given object implements the PlacesSearchResult interface.
 */
export function instanceOfPlacesSearchResult(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "places" in value;

    return isInstance;
}

export function PlacesSearchResultFromJSON(json: any): PlacesSearchResult {
    return PlacesSearchResultFromJSONTyped(json, false);
}

export function PlacesSearchResultFromJSONTyped(json: any, ignoreDiscriminator: boolean): PlacesSearchResult {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'places': ((json['places'] as Array<any>).map(PlaceFromJSON)),
        'warnings': !exists(json, 'warnings') ? undefined : ((json['warnings'] as Array<any>).map(WarningFromJSON)),
    };
}

export function PlacesSearchResultToJSON(value?: PlacesSearchResult | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'places': ((value.places as Array<any>).map(PlaceToJSON)),
        'warnings': value.warnings === undefined ? undefined : ((value.warnings as Array<any>).map(WarningToJSON)),
    };
}


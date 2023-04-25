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
/**
 * 
 * @export
 * @interface Warning
 */
export interface Warning {
    /**
     * A human readable message that describes the warning.
     * @type {string}
     * @memberof Warning
     */
    description: string;
    /**
     * A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.  
     * 
     * Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.  
     * 
     * * `GEOCODING_TIMEOUT` - The search ran into a timeout while trying to find results.  
     * * `GEOCODING_INPUT_TOO_LONG` - The input was rejected because it is too long.  
     *   * `maximumSize` - The maximum allowed size of the single input field `searchText`.
     * @type {string}
     * @memberof Warning
     */
    warningCode: string;
    /**
     * Additional properties specific to this class of warnings.
     * @type {{ [key: string]: any; }}
     * @memberof Warning
     */
    details?: { [key: string]: any; };
}

/**
 * Check if a given object implements the Warning interface.
 */
export function instanceOfWarning(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "description" in value;
    isInstance = isInstance && "warningCode" in value;

    return isInstance;
}

export function WarningFromJSON(json: any): Warning {
    return WarningFromJSONTyped(json, false);
}

export function WarningFromJSONTyped(json: any, ignoreDiscriminator: boolean): Warning {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'description': json['description'],
        'warningCode': json['warningCode'],
        'details': !exists(json, 'details') ? undefined : json['details'],
    };
}

export function WarningToJSON(value?: Warning | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'description': value.description,
        'warningCode': value.warningCode,
        'details': value.details,
    };
}

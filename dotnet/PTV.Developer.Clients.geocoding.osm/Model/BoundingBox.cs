/*
 * Geocoding OSM
 *
 * With the Geocoding OSM service places can be searched based on OSM data. The search is based on an address, text input or a geographical position.
 *
 * The version of the OpenAPI document: 1.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.geocoding.osm.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.geocoding.osm.Model
{
    /// <summary>
    /// Corner coordinates of the area surrounding the place.
    /// </summary>
    [DataContract(Name = "BoundingBox")]
    public partial class BoundingBox : IEquatable<BoundingBox>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BoundingBox" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BoundingBox() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BoundingBox" /> class.
        /// </summary>
        /// <param name="left">The longitude value in degrees (WGS84/EPSG:4326) from west to east. (required).</param>
        /// <param name="bottom">The latitude value in degrees (WGS84/EPSG:4326) from south to north. (required).</param>
        /// <param name="right">The longitude value in degrees (WGS84/EPSG:4326) from west to east. (required).</param>
        /// <param name="top">The latitude value in degrees (WGS84/EPSG:4326) from south to north. (required).</param>
        public BoundingBox(double? left = default(double?), double? bottom = default(double?), double? right = default(double?), double? top = default(double?))
        {
            // to ensure "left" is required (not null)
            if (left == null)
            {
                throw new ArgumentNullException("left is a required property for BoundingBox and cannot be null");
            }
            this.Left = left;
            // to ensure "bottom" is required (not null)
            if (bottom == null)
            {
                throw new ArgumentNullException("bottom is a required property for BoundingBox and cannot be null");
            }
            this.Bottom = bottom;
            // to ensure "right" is required (not null)
            if (right == null)
            {
                throw new ArgumentNullException("right is a required property for BoundingBox and cannot be null");
            }
            this.Right = right;
            // to ensure "top" is required (not null)
            if (top == null)
            {
                throw new ArgumentNullException("top is a required property for BoundingBox and cannot be null");
            }
            this.Top = top;
        }

        /// <summary>
        /// The longitude value in degrees (WGS84/EPSG:4326) from west to east.
        /// </summary>
        /// <value>The longitude value in degrees (WGS84/EPSG:4326) from west to east.</value>
        [DataMember(Name = "left", IsRequired = true, EmitDefaultValue = true)]
        public double? Left { get; set; }

        /// <summary>
        /// The latitude value in degrees (WGS84/EPSG:4326) from south to north.
        /// </summary>
        /// <value>The latitude value in degrees (WGS84/EPSG:4326) from south to north.</value>
        [DataMember(Name = "bottom", IsRequired = true, EmitDefaultValue = true)]
        public double? Bottom { get; set; }

        /// <summary>
        /// The longitude value in degrees (WGS84/EPSG:4326) from west to east.
        /// </summary>
        /// <value>The longitude value in degrees (WGS84/EPSG:4326) from west to east.</value>
        [DataMember(Name = "right", IsRequired = true, EmitDefaultValue = true)]
        public double? Right { get; set; }

        /// <summary>
        /// The latitude value in degrees (WGS84/EPSG:4326) from south to north.
        /// </summary>
        /// <value>The latitude value in degrees (WGS84/EPSG:4326) from south to north.</value>
        [DataMember(Name = "top", IsRequired = true, EmitDefaultValue = true)]
        public double? Top { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BoundingBox {\n");
            sb.Append("  Left: ").Append(Left).Append("\n");
            sb.Append("  Bottom: ").Append(Bottom).Append("\n");
            sb.Append("  Right: ").Append(Right).Append("\n");
            sb.Append("  Top: ").Append(Top).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as BoundingBox);
        }

        /// <summary>
        /// Returns true if BoundingBox instances are equal
        /// </summary>
        /// <param name="input">Instance of BoundingBox to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BoundingBox input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Left == input.Left ||
                    (this.Left != null &&
                    this.Left.Equals(input.Left))
                ) && 
                (
                    this.Bottom == input.Bottom ||
                    (this.Bottom != null &&
                    this.Bottom.Equals(input.Bottom))
                ) && 
                (
                    this.Right == input.Right ||
                    (this.Right != null &&
                    this.Right.Equals(input.Right))
                ) && 
                (
                    this.Top == input.Top ||
                    (this.Top != null &&
                    this.Top.Equals(input.Top))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Left != null)
                {
                    hashCode = (hashCode * 59) + this.Left.GetHashCode();
                }
                if (this.Bottom != null)
                {
                    hashCode = (hashCode * 59) + this.Bottom.GetHashCode();
                }
                if (this.Right != null)
                {
                    hashCode = (hashCode * 59) + this.Right.GetHashCode();
                }
                if (this.Top != null)
                {
                    hashCode = (hashCode * 59) + this.Top.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // Left (double?) maximum
            if (this.Left > (double?)180)
            {
                yield return new ValidationResult("Invalid value for Left, must be a value less than or equal to 180.", new [] { "Left" });
            }

            // Left (double?) minimum
            if (this.Left < (double?)-180)
            {
                yield return new ValidationResult("Invalid value for Left, must be a value greater than or equal to -180.", new [] { "Left" });
            }

            // Bottom (double?) maximum
            if (this.Bottom > (double?)90)
            {
                yield return new ValidationResult("Invalid value for Bottom, must be a value less than or equal to 90.", new [] { "Bottom" });
            }

            // Bottom (double?) minimum
            if (this.Bottom < (double?)-90)
            {
                yield return new ValidationResult("Invalid value for Bottom, must be a value greater than or equal to -90.", new [] { "Bottom" });
            }

            // Right (double?) maximum
            if (this.Right > (double?)180)
            {
                yield return new ValidationResult("Invalid value for Right, must be a value less than or equal to 180.", new [] { "Right" });
            }

            // Right (double?) minimum
            if (this.Right < (double?)-180)
            {
                yield return new ValidationResult("Invalid value for Right, must be a value greater than or equal to -180.", new [] { "Right" });
            }

            // Top (double?) maximum
            if (this.Top > (double?)90)
            {
                yield return new ValidationResult("Invalid value for Top, must be a value less than or equal to 90.", new [] { "Top" });
            }

            // Top (double?) minimum
            if (this.Top < (double?)-90)
            {
                yield return new ValidationResult("Invalid value for Top, must be a value greater than or equal to -90.", new [] { "Top" });
            }

            yield break;
        }
    }

}

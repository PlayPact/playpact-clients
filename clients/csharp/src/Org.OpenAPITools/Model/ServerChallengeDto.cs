/*
 * PlayPact API
 *
 * The API for PlayPact.
 *
 * The version of the OpenAPI document: v1
 * Contact: contact@playpact.com
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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ServerChallengeDto
    /// </summary>
    [DataContract(Name = "ServerChallengeDto")]
    public partial class ServerChallengeDto : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ServerChallengeDto" /> class.
        /// </summary>
        /// <param name="playerPlatformIdentifier">playerPlatformIdentifier.</param>
        /// <param name="serverIdentifier">serverIdentifier.</param>
        public ServerChallengeDto(string playerPlatformIdentifier = default(string), string serverIdentifier = default(string))
        {
            this.PlayerPlatformIdentifier = playerPlatformIdentifier;
            this.ServerIdentifier = serverIdentifier;
        }

        /// <summary>
        /// Gets or Sets PlayerPlatformIdentifier
        /// </summary>
        [DataMember(Name = "playerPlatformIdentifier", EmitDefaultValue = true)]
        public string PlayerPlatformIdentifier { get; set; }

        /// <summary>
        /// Gets or Sets ServerIdentifier
        /// </summary>
        [DataMember(Name = "serverIdentifier", EmitDefaultValue = true)]
        public string ServerIdentifier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ServerChallengeDto {\n");
            sb.Append("  PlayerPlatformIdentifier: ").Append(PlayerPlatformIdentifier).Append("\n");
            sb.Append("  ServerIdentifier: ").Append(ServerIdentifier).Append("\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}

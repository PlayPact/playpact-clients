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
    /// ServerDto
    /// </summary>
    [DataContract(Name = "ServerDto")]
    public partial class ServerDto : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ServerDto" /> class.
        /// </summary>
        /// <param name="playPactServerId">playPactServerId.</param>
        /// <param name="name">name.</param>
        /// <param name="description">description.</param>
        /// <param name="ipAddress">ipAddress.</param>
        /// <param name="port">port.</param>
        /// <param name="logoUri">logoUri.</param>
        /// <param name="tag">tag.</param>
        /// <param name="owner">owner.</param>
        /// <param name="enforcedRules">enforcedRules.</param>
        public ServerDto(Guid playPactServerId = default(Guid), string name = default(string), string description = default(string), string ipAddress = default(string), string port = default(string), string logoUri = default(string), string tag = default(string), UserListDto owner = default(UserListDto), List<RuleListDto> enforcedRules = default(List<RuleListDto>))
        {
            this.PlayPactServerId = playPactServerId;
            this.Name = name;
            this.Description = description;
            this.IpAddress = ipAddress;
            this.Port = port;
            this.LogoUri = logoUri;
            this.Tag = tag;
            this.Owner = owner;
            this.EnforcedRules = enforcedRules;
        }

        /// <summary>
        /// Gets or Sets PlayPactServerId
        /// </summary>
        [DataMember(Name = "playPactServerId", EmitDefaultValue = false)]
        public Guid PlayPactServerId { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name = "description", EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets IpAddress
        /// </summary>
        [DataMember(Name = "ipAddress", EmitDefaultValue = true)]
        public string IpAddress { get; set; }

        /// <summary>
        /// Gets or Sets Port
        /// </summary>
        [DataMember(Name = "port", EmitDefaultValue = true)]
        public string Port { get; set; }

        /// <summary>
        /// Gets or Sets LogoUri
        /// </summary>
        [DataMember(Name = "logoUri", EmitDefaultValue = true)]
        public string LogoUri { get; set; }

        /// <summary>
        /// Gets or Sets Tag
        /// </summary>
        [DataMember(Name = "tag", EmitDefaultValue = true)]
        public string Tag { get; set; }

        /// <summary>
        /// Gets or Sets Owner
        /// </summary>
        [DataMember(Name = "owner", EmitDefaultValue = false)]
        public UserListDto Owner { get; set; }

        /// <summary>
        /// Gets or Sets EnforcedRules
        /// </summary>
        [DataMember(Name = "enforcedRules", EmitDefaultValue = true)]
        public List<RuleListDto> EnforcedRules { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ServerDto {\n");
            sb.Append("  PlayPactServerId: ").Append(PlayPactServerId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  IpAddress: ").Append(IpAddress).Append("\n");
            sb.Append("  Port: ").Append(Port).Append("\n");
            sb.Append("  LogoUri: ").Append(LogoUri).Append("\n");
            sb.Append("  Tag: ").Append(Tag).Append("\n");
            sb.Append("  Owner: ").Append(Owner).Append("\n");
            sb.Append("  EnforcedRules: ").Append(EnforcedRules).Append("\n");
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

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
    /// PactPointReportTransactionDto
    /// </summary>
    [DataContract(Name = "PactPointReportTransactionDto")]
    public partial class PactPointReportTransactionDto : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PactPointReportTransactionDto" /> class.
        /// </summary>
        /// <param name="playPactServerId">playPactServerId.</param>
        /// <param name="amount">amount.</param>
        /// <param name="created">created.</param>
        /// <param name="reason">reason.</param>
        public PactPointReportTransactionDto(Guid playPactServerId = default(Guid), int amount = default(int), DateTime created = default(DateTime), string reason = default(string))
        {
            this.PlayPactServerId = playPactServerId;
            this.Amount = amount;
            this.Created = created;
            this.Reason = reason;
        }

        /// <summary>
        /// Gets or Sets PlayPactServerId
        /// </summary>
        [DataMember(Name = "playPactServerId", EmitDefaultValue = false)]
        public Guid PlayPactServerId { get; set; }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name = "amount", EmitDefaultValue = false)]
        public int Amount { get; set; }

        /// <summary>
        /// Gets or Sets Created
        /// </summary>
        [DataMember(Name = "created", EmitDefaultValue = false)]
        public DateTime Created { get; set; }

        /// <summary>
        /// Gets or Sets Reason
        /// </summary>
        [DataMember(Name = "reason", EmitDefaultValue = true)]
        public string Reason { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PactPointReportTransactionDto {\n");
            sb.Append("  PlayPactServerId: ").Append(PlayPactServerId).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  Reason: ").Append(Reason).Append("\n");
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

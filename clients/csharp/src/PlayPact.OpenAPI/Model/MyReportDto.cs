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
using OpenAPIDateConverter = PlayPact.OpenAPI.Client.OpenAPIDateConverter;

namespace PlayPact.OpenAPI.Model
{
    /// <summary>
    /// MyReportDto
    /// </summary>
    [DataContract(Name = "MyReportDto")]
    public partial class MyReportDto : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets ReportStatus
        /// </summary>
        [DataMember(Name = "reportStatus", EmitDefaultValue = false)]
        public ReportStatus? ReportStatus { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="MyReportDto" /> class.
        /// </summary>
        /// <param name="playPactReportId">playPactReportId.</param>
        /// <param name="accusation">accusation.</param>
        /// <param name="creator">creator.</param>
        /// <param name="subject">subject.</param>
        /// <param name="server">server.</param>
        /// <param name="reportStatus">reportStatus.</param>
        /// <param name="evidence">evidence.</param>
        /// <param name="objection">objection.</param>
        /// <param name="rules">rules.</param>
        public MyReportDto(Guid playPactReportId = default(Guid), string accusation = default(string), UserListDto creator = default(UserListDto), UserListDto subject = default(UserListDto), MyServerListDto server = default(MyServerListDto), ReportStatus? reportStatus = default(ReportStatus?), List<EvidenceDto> evidence = default(List<EvidenceDto>), ObjectionDto objection = default(ObjectionDto), List<RuleListDto> rules = default(List<RuleListDto>))
        {
            this.PlayPactReportId = playPactReportId;
            this.Accusation = accusation;
            this.Creator = creator;
            this.Subject = subject;
            this.Server = server;
            this.ReportStatus = reportStatus;
            this.Evidence = evidence;
            this.Objection = objection;
            this.Rules = rules;
        }

        /// <summary>
        /// Gets or Sets PlayPactReportId
        /// </summary>
        [DataMember(Name = "playPactReportId", EmitDefaultValue = false)]
        public Guid PlayPactReportId { get; set; }

        /// <summary>
        /// Gets or Sets Accusation
        /// </summary>
        [DataMember(Name = "accusation", EmitDefaultValue = true)]
        public string Accusation { get; set; }

        /// <summary>
        /// Gets or Sets Creator
        /// </summary>
        [DataMember(Name = "creator", EmitDefaultValue = false)]
        public UserListDto Creator { get; set; }

        /// <summary>
        /// Gets or Sets Subject
        /// </summary>
        [DataMember(Name = "subject", EmitDefaultValue = false)]
        public UserListDto Subject { get; set; }

        /// <summary>
        /// Gets or Sets Server
        /// </summary>
        [DataMember(Name = "server", EmitDefaultValue = false)]
        public MyServerListDto Server { get; set; }

        /// <summary>
        /// Gets or Sets Evidence
        /// </summary>
        [DataMember(Name = "evidence", EmitDefaultValue = true)]
        public List<EvidenceDto> Evidence { get; set; }

        /// <summary>
        /// Gets or Sets Objection
        /// </summary>
        [DataMember(Name = "objection", EmitDefaultValue = false)]
        public ObjectionDto Objection { get; set; }

        /// <summary>
        /// Gets or Sets Rules
        /// </summary>
        [DataMember(Name = "rules", EmitDefaultValue = true)]
        public List<RuleListDto> Rules { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MyReportDto {\n");
            sb.Append("  PlayPactReportId: ").Append(PlayPactReportId).Append("\n");
            sb.Append("  Accusation: ").Append(Accusation).Append("\n");
            sb.Append("  Creator: ").Append(Creator).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("  Server: ").Append(Server).Append("\n");
            sb.Append("  ReportStatus: ").Append(ReportStatus).Append("\n");
            sb.Append("  Evidence: ").Append(Evidence).Append("\n");
            sb.Append("  Objection: ").Append(Objection).Append("\n");
            sb.Append("  Rules: ").Append(Rules).Append("\n");
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

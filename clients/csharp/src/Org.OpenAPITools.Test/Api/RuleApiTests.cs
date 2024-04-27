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
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing RuleApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class RuleApiTests : IDisposable
    {
        private RuleApi instance;

        public RuleApiTests()
        {
            instance = new RuleApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of RuleApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' RuleApi
            //Assert.IsType<RuleApi>(instance);
        }

        /// <summary>
        /// Test CreateRule
        /// </summary>
        [Fact]
        public void CreateRuleTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateRuleDto? createRuleDto = null;
            //instance.CreateRule(createRuleDto);
        }

        /// <summary>
        /// Test GetRule
        /// </summary>
        [Fact]
        public void GetRuleTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid playPactRuleId = null;
            //var response = instance.GetRule(playPactRuleId);
            //Assert.IsType<RuleDto>(response);
        }

        /// <summary>
        /// Test GetRules
        /// </summary>
        [Fact]
        public void GetRulesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetRules();
            //Assert.IsType<List<RuleListDto>>(response);
        }

        /// <summary>
        /// Test UpdateRule
        /// </summary>
        [Fact]
        public void UpdateRuleTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //RuleDto? ruleDto = null;
            //instance.UpdateRule(ruleDto);
        }
    }
}

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

using PlayPact.OpenAPI.Client;
using PlayPact.OpenAPI.Api;

namespace PlayPact.OpenAPI.Test.Api
{
    /// <summary>
    ///  Class for testing TestApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class TestApiTests : IDisposable
    {
        private TestApi instance;

        public TestApiTests()
        {
            instance = new TestApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of TestApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' TestApi
            //Assert.IsType<TestApi>(instance);
        }

        /// <summary>
        /// Test TestAddingPactPoints
        /// </summary>
        [Fact]
        public void TestAddingPactPointsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? newAmount = null;
            //string reason = null;
            //instance.TestAddingPactPoints(newAmount, reason);
        }

        /// <summary>
        /// Test TestGettingPactPoints
        /// </summary>
        [Fact]
        public void TestGettingPactPointsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.TestGettingPactPoints();
        }

        /// <summary>
        /// Test TestGettingPactPointsHistory
        /// </summary>
        [Fact]
        public void TestGettingPactPointsHistoryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.TestGettingPactPointsHistory();
        }
    }
}
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
    ///  Class for testing ReviewApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ReviewApiTests : IDisposable
    {
        private ReviewApi instance;

        public ReviewApiTests()
        {
            instance = new ReviewApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ReviewApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ReviewApi
            //Assert.IsType<ReviewApi>(instance);
        }

        /// <summary>
        /// Test CreateReview
        /// </summary>
        [Fact]
        public void CreateReviewTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateReviewDto? createReviewDto = null;
            //instance.CreateReview(createReviewDto);
        }

        /// <summary>
        /// Test DeleteMyReview
        /// </summary>
        [Fact]
        public void DeleteMyReviewTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? playPactUserId = null;
            //Guid? playPactReview = null;
            //instance.DeleteMyReview(playPactUserId, playPactReview);
        }

        /// <summary>
        /// Test GetMyReview
        /// </summary>
        [Fact]
        public void GetMyReviewTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid playPactReportId = null;
            //var response = instance.GetMyReview(playPactReportId);
            //Assert.IsType<ReviewDto>(response);
        }

        /// <summary>
        /// Test GetReviews
        /// </summary>
        [Fact]
        public void GetReviewsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid playPactReportId = null;
            //var response = instance.GetReviews(playPactReportId);
            //Assert.IsType<List<ReviewDto>>(response);
        }

        /// <summary>
        /// Test UpdateMyReview
        /// </summary>
        [Fact]
        public void UpdateMyReviewTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? playPactUserId = null;
            //ReviewDto? reviewDto = null;
            //instance.UpdateMyReview(playPactUserId, reviewDto);
        }
    }
}

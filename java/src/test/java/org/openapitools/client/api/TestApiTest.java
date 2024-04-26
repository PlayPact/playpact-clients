/*
 * PlayPact API
 * The API for PlayPact.
 *
 * The version of the OpenAPI document: v1
 * Contact: contact@playpact.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TestApi
 */
@Disabled
public class TestApiTest {

    private final TestApi api = new TestApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testAddingPactPointsTest() throws ApiException {
        Integer newAmount = null;
        String reason = null;
        api.testAddingPactPoints(newAmount, reason);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testGettingPactPointsTest() throws ApiException {
        api.testGettingPactPoints();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testGettingPactPointsHistoryTest() throws ApiException {
        api.testGettingPactPointsHistory();
        // TODO: test validations
    }

}

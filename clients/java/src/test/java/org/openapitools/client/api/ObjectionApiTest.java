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
import org.openapitools.client.model.CreateObjectionDto;
import org.openapitools.client.model.ObjectionDto;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectionApi
 */
@Disabled
public class ObjectionApiTest {

    private final ObjectionApi api = new ObjectionApi();

    /**
     * Creates a objection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMyObjectionTest() throws ApiException {
        CreateObjectionDto createObjectionDto = null;
        api.createMyObjection(createObjectionDto);
        // TODO: test validations
    }

    /**
     * Gets the objection for a report with more details.  Only works for the user who created the report.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMyObjectionTest() throws ApiException {
        UUID playPactReportId = null;
        UUID playPactUserId = null;
        ObjectionDto response = api.getMyObjection(playPactReportId, playPactUserId);
        // TODO: test validations
    }

    /**
     * Gets the objection for a report.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getObjectionTest() throws ApiException {
        UUID playPactReportId = null;
        UUID playPactUserId = null;
        ObjectionDto response = api.getObjection(playPactReportId, playPactUserId);
        // TODO: test validations
    }

    /**
     * TODO: Updates a objection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMyObjectionTest() throws ApiException {
        UUID playPactObjectionId = null;
        ObjectionDto objectionDto = null;
        api.updateMyObjection(playPactObjectionId, objectionDto);
        // TODO: test validations
    }

}

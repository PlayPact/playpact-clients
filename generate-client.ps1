param (
    [string]$programmingLanguage,
    [string]$url
)

# Docker command
$dockerCommand = @"
docker run --network host --rm -v ${PWD}:/local openapitools/openapi-generator-cli generate -i $url -g $programmingLanguage -o local/clients/$programmingLanguage -c local/config.yaml
"@

# Execute the Docker command
Invoke-Expression $dockerCommand
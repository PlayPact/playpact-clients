# Client generation
To generate a client run the powershell script (generate-client.ps1) with the first parameter containing the desired programming language and the second the openapi definition as ```.yaml``` or ```.json```.

## Example

```ps
.\generate-client.ps1 csharp "http://host.docker.internal:8081/swagger/v1/swagger.json"
```

## Supported programming languages
Clients are created with [openapi-generator](https://github.com/OpenAPITools/openapi-generator). [Click for the supported languages](https://github.com/OpenAPITools/openapi-generator).
package com.register.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

import java.security.Security;

@OpenAPIDefinition(
        info = @Info(
                title = "Registrations Form",
                description = "Doing Fetch and Register Methods",
                summary = "this api will add new users and fetch all the users",
                termsOfService = "T&C",

                contact = @Contact(
                        name = "varun",
                        email = "vvarunsharma64@gmail.com"
                ),

                license = @License(
                        name = " ----- "
                ),

                version = "v1"
        ),
        servers = {
                @Server(
                        description = "Dev",
                        url = "http://localhost:6969"
                ),
                @Server(
                        description = "Test",
                        url = "http://localhost:6969"
                )
        },
        security = @SecurityRequirement(
                name = "Security"
        )
)
@SecurityScheme(
        name = "Security",
        in = SecuritySchemeIn.HEADER,
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer",
        description = "security desc"
)

public class OpenApiConfig{

}


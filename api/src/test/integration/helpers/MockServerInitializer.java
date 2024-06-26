package helpers;

import com.javadiscord.jdi.core.Discord;

public class MockServerInitializer {
    private static final String OPEN_API_SPEC = "mocks/openapi-spec.json";
    private static final String API_VERSION = "/api/v10";
    private static final String DISCORD_BASE_URL_ENV_VAR = "DISCORD_BASE_URL";
    private static Discord discord;

    /* static {
        MockEngine imposter =
                new OpenApiImposterBuilder<>()
                        .withSpecificationFile(Paths.get(OPEN_API_SPEC))
                        .startBlocking();
        System.setProperty(
                DISCORD_BASE_URL_ENV_VAR,
                "%s%s".formatted(imposter.getBaseUrl().toString(), API_VERSION));
        discord = new Discord("dummy-bot-token");
        discord.startWithoutGatewayEvents();
    }*/

    public static Discord getDiscord() {
        return discord;
    }
}

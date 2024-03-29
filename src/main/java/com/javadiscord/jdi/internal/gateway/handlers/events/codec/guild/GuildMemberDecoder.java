package com.javadiscord.jdi.internal.gateway.handlers.events.codec.guild;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javadiscord.jdi.internal.gateway.GatewayEvent;
import com.javadiscord.jdi.internal.gateway.handlers.events.codec.EventDecoder;
import com.javadiscord.jdi.internal.models.guild.Guild;
import com.javadiscord.jdi.internal.models.user.Member;

public class GuildMemberDecoder implements EventDecoder<Member> {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Override
    public Member decode(GatewayEvent gatewayEvent) {
        try {
            return OBJECT_MAPPER.readValue(gatewayEvent.data().toString(), Member.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

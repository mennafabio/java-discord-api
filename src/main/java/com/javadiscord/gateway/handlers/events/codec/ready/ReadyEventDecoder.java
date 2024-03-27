package com.javadiscord.gateway.handlers.events.codec.ready;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javadiscord.gateway.GatewayEvent;
import com.javadiscord.gateway.handlers.events.codec.EventDecoder;

public class ReadyEventDecoder implements EventDecoder<ReadyEvent> {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Override
    public ReadyEvent decode(GatewayEvent gatewayEvent) {
        try {
            return OBJECT_MAPPER.readValue(gatewayEvent.data().toString(), ReadyEvent.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

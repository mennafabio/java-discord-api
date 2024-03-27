package com.javadiscord.gateway.handlers.events.codec;

import com.javadiscord.gateway.GatewayEvent;

public interface EventDecoder<T extends Event> {
    T decode(GatewayEvent event);
}

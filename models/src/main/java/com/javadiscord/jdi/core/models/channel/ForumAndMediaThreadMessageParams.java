package com.javadiscord.jdi.core.models.channel;

import java.util.List;

import com.javadiscord.jdi.core.models.message.embed.Embed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ForumAndMediaThreadMessageParams(
    @JsonProperty("content") String content,
    @JsonProperty("embeds") List<Embed> embeds,
    @JsonProperty("allowed_mentions") AllowedMentions allowedMentions,
    @JsonProperty("components") List<Integer> components,
    @JsonProperty("sticker_ids") List<Long> stickerIds,
    @JsonProperty("attachments") List<Attachment> attachments,
    @JsonProperty("flags") int flags
) {}

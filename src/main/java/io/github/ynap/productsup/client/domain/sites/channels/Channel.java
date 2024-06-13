package io.github.ynap.productsup.client.domain.sites.channels;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ynap.productsup.client.domain.sites.channels.history.History;

import java.util.List;
import java.util.SortedMap;

public record Channel(String id,
                      @JsonProperty("site_id")
                      String siteId,
                      @JsonProperty("channel_id")
                      String channelId,
                      String name,
                      @JsonProperty("export_name")
                      String exportName,
                      @JsonProperty("history")
                      List<History> histories,
                      List<SortedMap<String, String>> links) {
}

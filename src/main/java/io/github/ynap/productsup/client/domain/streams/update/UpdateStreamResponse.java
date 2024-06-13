package io.github.ynap.productsup.client.domain.streams.update;

import io.github.ynap.productsup.client.domain.streams.Relationships;
import io.github.ynap.productsup.client.domain.streams.Stream;

/**
 * Update stream response.
 *
 * @param data - {@link Stream}
 * @param relationships - {@link Relationships}
 */
public record UpdateStreamResponse(
        Stream data,
        Relationships relationships
) {
}

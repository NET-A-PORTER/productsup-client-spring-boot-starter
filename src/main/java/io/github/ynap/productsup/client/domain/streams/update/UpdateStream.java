package io.github.ynap.productsup.client.domain.streams.update;

import io.github.ynap.productsup.client.domain.streams.Stream;

/**
 * Update stream request.
 *
 * @param data - {@link Stream}
 */
public record UpdateStream(Stream data) {
}

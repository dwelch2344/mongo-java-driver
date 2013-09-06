/*
 * Copyright (c) 2008 - 2013 10gen, Inc. <http://10gen.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mongodb.session;

import org.mongodb.MongoFuture;

import java.io.Closeable;

/**
 * A session.
 *
 * @since 3.0
 */
public interface Session extends Closeable {
    /**
     * Creates a server channel provider.
     *
     * @param options the server channel provider options
     * @return the server channel provider
     */
    ServerChannelProvider createServerChannelProvider(ServerChannelProviderOptions options);

    /**
     * Asynchronously creates a server channel provider.
     *
     * @param options the server channel provider options
     * @return a future for the server channel provider
     */
    MongoFuture<ServerChannelProvider> createServerChannelProviderAsync(ServerChannelProviderOptions options);

    void close();

    boolean isClosed();
}

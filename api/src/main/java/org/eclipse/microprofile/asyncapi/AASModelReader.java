/**
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.microprofile.asyncapi;

import org.eclipse.microprofile.asyncapi.models.AsyncAPI;

/**
 * This interface allows application developers to programmatically contribute an AsyncAPI model tree.
 * <p>
 * In this scenario the developer can choose whether to provide the entire AsyncAPI model while disabling annotation
 * scanning, or they can provide a starting AsyncAPI model to be augmented with the application annotations.
 * <p>
 * The registration of this model reader is controlled by setting the key <b>mp.asyncapi.model.reader</b> using
 * one of the configuration sources specified in <a href="https://github.com/eclipse/microprofile-config">MicroProfile Config</a>.
 * The value is the fully qualified name of the model reader implementation, which needs to be visible to the application's classloader.
 */
public interface AASModelReader {

    /**
     * This method is called by the vendor's AsyncAPI processing framework.  It can be a fully complete and valid AsyncAPI
     * model tree, or a partial base model tree that will be augmented by either annotations or pre-generated AsyncAPI documents.
     *
     * @return the AsyncAPI model to be used by the vendor
     */
    AsyncAPI buildModel();
}

/*
Copyright 2013-2014 SpruceHill.io GmbH 2014 Stephan Wienczny

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package io.sprucehill.mandrill.service;

import java.io.IOException;
import java.util.List;

import io.sprucehill.mandrill.data.error.MessageError;
import io.sprucehill.mandrill.data.error.PreBuildError;
import io.sprucehill.mandrill.data.request.RejectsAddPayload;
import io.sprucehill.mandrill.data.request.RejectsDeletePayload;
import io.sprucehill.mandrill.data.request.RejectsListPayload;
import io.sprucehill.mandrill.data.response.AnyListAddResponse;
import io.sprucehill.mandrill.data.response.AnyListDeleteResponse;
import io.sprucehill.mandrill.data.response.AnyListListResponse;

/**
 * @author Stephan Wienczny <stephan.wienczny@ybm-deutschland.de>
 */
public interface IRejectsService {
    /**
     * @param payload
     * @return
     * @throws io.sprucehill.mandrill.data.error.MessageError
     * @throws java.io.IOException
     */
    AnyListAddResponse add(final RejectsAddPayload payload)
            throws MessageError, IOException;

    /**
     * @param payloadBuilder
     * @return
     * @throws io.sprucehill.mandrill.data.error.PreBuildError
     * @throws io.sprucehill.mandrill.data.error.MessageError
     * @throws java.io.IOException
     */
    AnyListAddResponse add(final RejectsAddPayload.Builder payloadBuilder)
            throws PreBuildError, MessageError, IOException;

    /**
     * @param payload
     * @return
     * @throws io.sprucehill.mandrill.data.error.MessageError
     * @throws java.io.IOException
     */
    AnyListDeleteResponse delete(final RejectsDeletePayload payload)
            throws MessageError, IOException;

    /**
     * @param payloadBuilder
     * @return
     * @throws io.sprucehill.mandrill.data.error.PreBuildError
     * @throws io.sprucehill.mandrill.data.error.MessageError
     * @throws java.io.IOException
     */
    AnyListDeleteResponse delete(final RejectsDeletePayload.Builder payloadBuilder)
            throws PreBuildError, MessageError, IOException;

    /**
     * @param payload
     * @return
     * @throws io.sprucehill.mandrill.data.error.MessageError
     * @throws java.io.IOException
     */
    List<AnyListListResponse> list(final RejectsListPayload payload)
            throws MessageError, IOException;

    /**
     * @param payloadBuilder
     * @return
     * @throws io.sprucehill.mandrill.data.error.PreBuildError
     * @throws io.sprucehill.mandrill.data.error.MessageError
     * @throws java.io.IOException
     */
    List<AnyListListResponse> list(final RejectsListPayload.Builder payloadBuilder)
            throws PreBuildError, MessageError, IOException;

}
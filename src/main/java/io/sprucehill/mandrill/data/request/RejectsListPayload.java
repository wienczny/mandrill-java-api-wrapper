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

package io.sprucehill.mandrill.data.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Stephan Wienczny <stephan.wienczny@ybm-deutschland.de>
 */
public class RejectsListPayload extends AbstractRejectsPayload {

    @JsonProperty("include_expired")
    protected boolean includeExpired = Boolean.FALSE;

    @Override
    public String getPath() {
        return "/rejects/list.json";
    }

    public static abstract class Init<T extends Init<T, U>, U extends RejectsListPayload>
            extends AbstractRejectsPayload.Init<T, U> {

        protected Init(final U object) {
            super(object);
        }

        public T withIncludeExpired() {
            object.includeExpired = Boolean.TRUE;
            return self();
        }

        public T withoutIncludeExpired() {
            object.includeExpired = Boolean.FALSE;
            return self();
        }
    }

    public static class Builder extends Init<Builder, RejectsListPayload> {

        public Builder() {
            super(new RejectsListPayload());
        }

        protected Builder(final RejectsListPayload object) {
            super(object);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}

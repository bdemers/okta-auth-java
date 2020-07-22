/*
 * Copyright 2020-Present Okta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.okta.authn.sdk.impl.resource;

import com.okta.authn.sdk.resource.WebAuthnUserFactorProfile;
import com.okta.sdk.impl.ds.InternalDataStore;
import com.okta.sdk.impl.resource.AbstractResource;
import com.okta.sdk.impl.resource.Property;
import com.okta.sdk.impl.resource.StringProperty;

import java.util.Map;

public class DefaultWebAuthnUserFactorProfile extends AbstractResource implements WebAuthnUserFactorProfile {

    private final static StringProperty credentialIdProperty = new StringProperty("credentialId");
    private final static StringProperty authenticatorNameProperty = new StringProperty("authenticatorName");

    private final static Map<String, Property> PROPERTY_DESCRIPTORS = createPropertyDescriptorMap(credentialIdProperty, authenticatorNameProperty);

    public DefaultWebAuthnUserFactorProfile(InternalDataStore dataStore) {
        super(dataStore);
    }

    public DefaultWebAuthnUserFactorProfile(InternalDataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public Map<String, Property> getPropertyDescriptors() {
        return PROPERTY_DESCRIPTORS;
    }


    public String getCredentialId() {
        return  getString(credentialIdProperty);
    }

    public WebAuthnUserFactorProfile setCredentialId(String credentialId) {
        setProperty(credentialIdProperty, credentialId);
        return this;
    }

    public String getAuthenticatorName() {
        return  getString(authenticatorNameProperty);
    }

    public WebAuthnUserFactorProfile setAuthenticatorName(String authenticatorName) {
        setProperty(authenticatorNameProperty, authenticatorName);
        return this;
    }

}

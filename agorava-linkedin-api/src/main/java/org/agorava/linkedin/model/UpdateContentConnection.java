/*
 * Copyright 2014 Agorava
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

package org.agorava.linkedin.model;

import java.util.List;

/**
 * Model class representing a connection update
 *
 * @author Robert Drysdale
 * @author Antoine Sabot-Durand
 */
public class UpdateContentConnection extends UpdateContent {

    private static final long serialVersionUID = 1L;

    private List<LinkedInProfile> connections;

    public UpdateContentConnection(String id, String firstName, String lastName, String email, String headline, String industry,
            String publicProfileUrl, UrlResource siteStandardProfileRequest, String profilePictureUrl) {
        super(id, firstName, lastName, email, headline, industry, publicProfileUrl, siteStandardProfileRequest,
                profilePictureUrl);
    }

    public List<LinkedInProfile> getConnections() {
        return connections;
    }

}

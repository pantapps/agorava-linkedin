/*
 * Copyright 2013 Agorava
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
 * Search result for querying profiles
 *
 * @author Robert Drysdale
 * @author Antoine Sabot-Durand
 */
public class LinkedInProfiles extends SearchResult {

    private static final long serialVersionUID = 1L;

    public LinkedInProfiles(int count, int start, int total) {
        super(count, start, total);
    }

    private List<LinkedInProfile> people;

    public List<LinkedInProfile> getPeople() {
        return people;
    }

}

/**
 * Copyright (c) 2006-2018 The Apereo Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://opensource.org/licenses/ecl2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sakaiproject.sitestats.api.event.detailed.announcements;

import org.sakaiproject.sitestats.api.event.detailed.ResolvedEventData;

/**
 * Data for an announcement
 * @author plukasew
 */
public class AnnouncementData implements ResolvedEventData
{
	public final String title;

	/**
	 * Constructor
	 * @param title the title of the announcement
	 */
	public AnnouncementData(String title)
	{
		this.title = title;
	}
}

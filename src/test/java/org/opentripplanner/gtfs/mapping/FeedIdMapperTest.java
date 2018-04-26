/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.gtfs.mapping;

import org.junit.Test;
import org.opentripplanner.model.FeedId;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.opentripplanner.gtfs.mapping.AgencyAndIdMapper.mapAgencyAndId;

public class FeedIdMapperTest {

    @Test
    public void testMapAgencyAndId() throws Exception {
        org.onebusaway.gtfs.model.AgencyAndId inputId = new org.onebusaway.gtfs.model.AgencyAndId(
                "A", "1"
        );

        FeedId mappedId = mapAgencyAndId(inputId);

        assertEquals("A", mappedId.getAgencyId());
        assertEquals("1", mappedId.getId());
    }

    @Test
    public void testMapAgencyAndIdWithNulls() throws Exception {
        org.onebusaway.gtfs.model.AgencyAndId inputId = new org.onebusaway.gtfs.model.AgencyAndId();

        FeedId mappedId = mapAgencyAndId(inputId);

        assertNull(mappedId.getAgencyId());
        assertNull(mappedId.getId());
    }
}
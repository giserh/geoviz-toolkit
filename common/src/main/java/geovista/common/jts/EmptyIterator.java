/*
 *    GeoTools - OpenSource mapping toolkit
 *    http://geotools.org
 *    (C) 2004-2006, GeoTools Project Managment Committee (PMC)
 *    
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package geovista.common.jts;

/**
 * An iterator for empty geometries
 * 
 * @since 2.4
 */
public class EmptyIterator extends AbstractLiteIterator {
    public int getWindingRule() {
        return WIND_NON_ZERO;
    }

    public boolean isDone() {
        return true;
    }

    public void next() {
        throw new IllegalStateException();
    }

    public int currentSegment(double[] coords) {
        return 0;
    }
}
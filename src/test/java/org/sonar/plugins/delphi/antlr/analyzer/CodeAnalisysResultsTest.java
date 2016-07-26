/*
 * Sonar Delphi Plugin
 * Copyright (C) 2011 Sabre Airline Solutions and Fabricio Colombo
 * Author(s):
 * Przemyslaw Kociolek (przemyslaw.kociolek@sabre.com)
 * Michal Wojcik (michal.wojcik@sabre.com)
 * Fabricio Colombo (fabricio.colombo.mva@gmail.com)
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.delphi.antlr.analyzer;

import org.junit.Before;
import org.junit.Test;
import org.sonar.plugins.delphi.core.language.impl.DelphiUnit;

import static org.junit.Assert.assertEquals;

public class CodeAnalisysResultsTest {

    private CodeAnalysisResults result;

    @Before
    public void init() {
        result = new CodeAnalysisResults();
    }

    @Test
    public void getActiveUnitTest() {
        result.setActiveUnit(new DelphiUnit("test"));
        assertEquals(new DelphiUnit("test"), result.getActiveUnit());
    }

}

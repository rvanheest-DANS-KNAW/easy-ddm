/**
 * Copyright (C) ${project.inceptionYear} DANS - Data Archiving and Networked Services (info@dans.knaw.nl) Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package nl.knaw.dans.pf.language.ddm.api;

import org.junit.Test;

import java.io.File;

public class Ddm2EmdDocTest {
    @Test
    public void createSwordPackagingDocFragment() throws Exception {
        File file = new File("target/pageDumps/swordPackagingFragmentHelp.html");
        file.getParentFile().mkdirs();
        Ddm2EmdDoc.main(new String[] {file.getAbsolutePath()});
    }
}

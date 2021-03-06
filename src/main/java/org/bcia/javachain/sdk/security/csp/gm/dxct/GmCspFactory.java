package org.bcia.javachain.sdk.security.csp.gm.dxct;

/**
 * Copyright BCIA. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.bcia.javachain.sdk.security.csp.factory.ICspFactory;
import org.bcia.javachain.sdk.security.csp.factory.IFactoryOpts;
import org.bcia.javachain.sdk.security.csp.intfs.ICsp;

/**
 * @author zhanglin
 * @purpose Define the class, GmCspFactory
 * @date 2018-01-25
 * @company Dingxuan
 */

public class GmCspFactory implements ICspFactory {

    public GmCspFactory(){

    }

    @Override
    public String getName(){
        return IFactoryOpts.PROVIDER_GM;
    }

    @Override
    public ICsp getCsp(IFactoryOpts opts){
        IGmFactoryOpts gmOpts=(IGmFactoryOpts) opts;
        GmCsp gmCsp =new GmCsp(gmOpts);
        return gmCsp;
    }
}

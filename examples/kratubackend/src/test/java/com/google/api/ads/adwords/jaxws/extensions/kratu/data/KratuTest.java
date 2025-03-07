// Copyright 2014 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.jaxws.extensions.kratu.data;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.adwords.jaxws.extensions.report.model.util.DateUtil;

import org.junit.Test;

import java.util.Date;

/**
 * Test case for the {@code Kratu} class.
 * 
 * @author jtoledo@google.com (Julian Toledo)
 */
public class KratuTest {

  /*
   * Test Kratu Constructor
   */
  @Test
  public void testRun() {
    Date date1 = DateUtil.parseDateTime("20140601").toDate();

    Account account = new Account();
    account.setCurrencyCode("EUR");
    account.setDateTimeZone("Europe/Paris");
    account.setExternalCustomerId(777L);
    account.setName("Account1");

    Kratu kratu1 = new Kratu(123L, account, date1);
    
    assertEquals(kratu1.getTopAccountId(), new Long(123));
    assertEquals(kratu1.getExternalCustomerId(), new Long(777));
    assertEquals(kratu1.getAccountName(), "Account1");
    assertEquals(kratu1.getCurrencyCode(), "EUR");
    assertEquals(kratu1.getDateTimeZone(), "Europe/Paris");
    assertEquals(kratu1.getDay(), date1);
    assertEquals(kratu1.getId(), "777-20140601");
  }
}

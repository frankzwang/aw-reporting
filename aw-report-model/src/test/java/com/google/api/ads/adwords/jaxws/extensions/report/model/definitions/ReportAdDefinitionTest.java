// Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.jaxws.extensions.report.model.definitions;

import com.google.api.ads.adwords.jaxws.extensions.report.model.entities.ReportAd;
import com.google.api.ads.adwords.lib.jaxb.v201402.ReportDefinitionReportType;

import junit.framework.Assert;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Tests the Ad Performance report definition.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aw-report-model-test-beans.xml")
public class ReportAdDefinitionTest extends AbstractReportDefinitionTest<ReportAd> {

  /**
   * C'tor
   */
  public ReportAdDefinitionTest() {
    super(ReportAd.class, ReportDefinitionReportType.AD_PERFORMANCE_REPORT,
        "src/test/resources/csv/ad-performance.csv");
  }

  /**
   * @see com.google.api.ads.adwords.jaxws.extensions.report.model.definitions.
   * AbstractReportDefinitionTest#testFirstEntry
   * (com.google.api.ads.adwords.jaxws.extensions.report.model.entities.Report)
   */
  @Override
  protected void testFirstEntry(ReportAd first) {

    Assert.assertEquals(1001270004L, first.getAccountId().longValue());
    Assert.assertEquals("2013-05-01", first.getDay());
    Assert.assertEquals(9.39, first.getCostBigDecimal().doubleValue());
    Assert.assertEquals(32L, first.getClicks().longValue());
    Assert.assertEquals(1258L, first.getImpressions().longValue());
    Assert.assertEquals(0L, first.getConversions().longValue());
    Assert.assertEquals(2.54, first.getCtrBigDecimal().doubleValue());
    Assert.assertEquals(7.46, first.getAvgCpmBigDecimal().doubleValue());
    Assert.assertEquals(0.29, first.getAvgCpcBigDecimal().doubleValue());
    Assert.assertEquals(2.12, first.getAvgPositionBigDecimal().doubleValue());
    Assert.assertEquals("EUR", first.getCurrencyCode());

    Assert.assertEquals(132958027L, first.getCampaignId().longValue());
    Assert.assertEquals(6113972227L, first.getAdGroupId().longValue());
    Assert.assertEquals(20549800987L, first.getAdId().longValue());
    Assert.assertEquals("enabled", first.getAdState());
    Assert.assertEquals("approved", first.getCreativeApprovalStatus());

  }

  /**
   * @see com.google.api.ads.adwords.jaxws.extensions.report.model.definitions.
   * AbstractReportDefinitionTest#testLastEntry(
   * com.google.api.ads.adwords.jaxws.extensions.report.model.entities.Report)
   */
  @Override
  protected void testLastEntry(ReportAd last) {

    Assert.assertEquals(1001270004L, last.getAccountId().longValue());
    Assert.assertEquals("2013-05-10", last.getDay());
    Assert.assertEquals(1.46, last.getCostBigDecimal().doubleValue());
    Assert.assertEquals(2L, last.getClicks().longValue());
    Assert.assertEquals(58L, last.getImpressions().longValue());
    Assert.assertEquals(0L, last.getConversions().longValue());
    Assert.assertEquals(3.45, last.getCtrBigDecimal().doubleValue());
    Assert.assertEquals(25.17, last.getAvgCpmBigDecimal().doubleValue());
    Assert.assertEquals(0.73, last.getAvgCpcBigDecimal().doubleValue());
    Assert.assertEquals(3.29, last.getAvgPositionBigDecimal().doubleValue());
    Assert.assertEquals("EUR", last.getCurrencyCode());

    Assert.assertEquals(132958027L, last.getCampaignId().longValue());
    Assert.assertEquals(6114146707L, last.getAdGroupId().longValue());
    Assert.assertEquals(20551837747L, last.getAdId().longValue());
    Assert.assertEquals("enabled", last.getAdState());
    Assert.assertEquals("approved", last.getCreativeApprovalStatus());

  }

  /**
   * @see com.google.api.ads.adwords.jaxws.extensions.report.model.definitions.
   * AbstractReportDefinitionTest#retrieveCsvEntries()
   */
  @Override
  protected int retrieveCsvEntries() {
    return 20;
  }

  /**
   * @see com.google.api.ads.adwords.jaxws.extensions.report.model.definitions.
   * AbstractReportDefinitionTest#retrievePropertiesToBeSelected()
   */
  @Override
  protected String[] retrievePropertiesToBeSelected() {

    return new String[] {
        // Report
        "ExternalCustomerId",
        // ReportBase
        "AccountDescriptiveName",
        "AccountTimeZoneId",
        "CustomerDescriptiveName",
        "PrimaryCompanyName",
        "AccountCurrencyCode",
        "Date",
        "DayOfWeek",
        "Week",
        "Month",
        "MonthOfYear",
        "Quarter",
        "Year",
        "Cost",
        "Clicks",
        "Impressions",
        "Ctr",
        "AverageCpm",
        "AverageCpc",
        "AveragePosition",
        "Device",
        "ClickType",
        "AdNetworkType1",
        "AdNetworkType2",
        "ConversionsManyPerClick",
        "ConversionManyPerClickSignificance",
        "ConversionRateManyPerClickSignificance",
        "ConversionRateManyPerClick",
        "CostPerConversionManyPerClick",
        "CostPerConversionManyPerClickSignificance",
        "ValuePerConvManyPerClick",
        "ValuePerConversionManyPerClick",
        "Conversions",
        "ConversionRate",
        "ConversionRateSignificance",
        "ConversionSignificance",
        "CostPerConversion",
        "CostPerConversionSignificance",
        "ValuePerConv",
        "ValuePerConversion",
        "ConversionCategoryName",
        "ConversionTypeName",
        "ConversionValue",
        "ViewThroughConversions",
        // Specific to Ad Performance
        "CampaignId",
        "AdGroupId",
        "Id",
        "Status",
        "DisplayUrl",
        "Url",
        "Headline",
        "Description1",
        "Description2",
        "CreativeApprovalStatus",
        // Analytics Fieds        
        "AveragePageviews",
        "AverageTimeOnSite",
        "BounceRate",
        "PercentNewVisitors"
    };
  }
}

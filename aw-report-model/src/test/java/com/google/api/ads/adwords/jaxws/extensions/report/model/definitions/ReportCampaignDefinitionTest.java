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

import com.google.api.ads.adwords.jaxws.extensions.report.model.entities.ReportCampaign;
import com.google.api.ads.adwords.lib.jaxb.v201402.ReportDefinitionReportType;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

/**
 * Tests the Campaign Performance report definition.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aw-report-model-test-beans.xml")
public class ReportCampaignDefinitionTest extends AbstractReportDefinitionTest<ReportCampaign> {

  /**
   * C'tor
   */
  public ReportCampaignDefinitionTest() {

    super(ReportCampaign.class, ReportDefinitionReportType.CAMPAIGN_PERFORMANCE_REPORT,
        "src/test/resources/csv/campaign.csv");
  }

  /**
   * @see com.google.api.ads.adwords.jaxws.extensions.report.model.definitions.
   * AbstractReportDefinitionTest#testFirstEntry(
   * com.google.api.ads.adwords.jaxws.extensions.report.model.entities.Report)
   */
  @Override
  protected void testFirstEntry(ReportCampaign first) {

    Assert.assertEquals(1232422123L, first.getAccountId().longValue());
    Assert.assertEquals("2013-05-01", first.getDay());
    Assert.assertEquals(1.11, first.getCostBigDecimal().doubleValue());
    Assert.assertEquals(5L, first.getClicks().longValue());
    Assert.assertEquals(927L, first.getImpressions().longValue());
    Assert.assertEquals(0L, first.getConversions().longValue());
    Assert.assertEquals(0.54, first.getCtrBigDecimal().doubleValue());
    Assert.assertEquals(1.20, first.getAvgCpmBigDecimal().doubleValue());
    Assert.assertEquals(0.22, first.getAvgCpcBigDecimal().doubleValue());
    Assert.assertEquals(3.59, first.getAvgPositionBigDecimal().doubleValue());
    Assert.assertEquals("EUR", first.getCurrencyCode());

    Assert.assertEquals(132449648L, first.getCampaignId().longValue());
    Assert.assertEquals("active", first.getStatus());
    Assert.assertEquals(1.00, first.getBudgetBigDecimal().doubleValue());

  }

  /**
   * @see com.google.api.ads.adwords.jaxws.extensions.report.model.definitions.
   * AbstractReportDefinitionTest#testLastEntry(
   * com.google.api.ads.adwords.jaxws.extensions.report.model.entities.Report)
   */
  @Override
  protected void testLastEntry(ReportCampaign last) {

    Assert.assertEquals(1232422123L, last.getAccountId().longValue());
    Assert.assertEquals("2013-05-10", last.getDay());
    Assert.assertEquals(0.88, last.getCostBigDecimal().doubleValue());
    Assert.assertEquals(6L, last.getClicks().longValue());
    Assert.assertEquals(757L, last.getImpressions().longValue());
    Assert.assertEquals(0L, last.getConversions().longValue());
    Assert.assertEquals(0.79, last.getCtrBigDecimal().doubleValue());
    Assert.assertEquals(1.16, last.getAvgCpmBigDecimal().doubleValue());
    Assert.assertEquals(0.15, last.getAvgCpcBigDecimal().doubleValue());
    Assert.assertEquals(3.21, last.getAvgPositionBigDecimal().doubleValue());
    Assert.assertEquals("EUR", last.getCurrencyCode());

    Assert.assertEquals(132449648L, last.getCampaignId().longValue());
    Assert.assertEquals("active", last.getStatus());
    Assert.assertEquals(1.00, last.getBudgetBigDecimal().doubleValue());

  }

  /**
   * @see com.google.api.ads.adwords.jaxws.extensions.report.model.definitions.
   * AbstractReportDefinitionTest#retrieveCsvEntries()
   */
  @Override
  protected int retrieveCsvEntries() {

    return 10;
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
        // Specific to Campaign Performance Report
        "CampaignId",
        "CampaignName",
        "Status",
        "Amount",
        // Analytics Fieds        
        "AveragePageviews",
        "AverageTimeOnSite",
        "BounceRate",
        "PercentNewVisitors"
    };
  }
}
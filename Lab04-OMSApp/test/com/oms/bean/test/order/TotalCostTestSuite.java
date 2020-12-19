package com.oms.bean.test.order;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.com.oms.serverapi.test.BookApiTest;
import test.com.oms.serverapi.test.CompactDiscApiTest;
import test.com.oms.serverapi.test.ParameterizedBookApiTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	TotalCostBlackBoxTest.class, 
	TotalCostWhiteBoxTest.class
	})
public class TotalCostTestSuite {

}

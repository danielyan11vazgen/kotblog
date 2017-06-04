package com.excref.kotblog.service.test

import com.excref.kotblog.service.test.helper.ServiceImplTestHelper
import org.easymock.EasyMockRunner
import org.easymock.EasyMockSupport
import org.junit.Ignore
import org.junit.runner.RunWith

/**
 * @author Arthur Asatryan
 * @since 6/4/17 4:08 PM
 */
@Ignore
@RunWith(EasyMockRunner::class)
abstract class AbstractServiceImplTest constructor(protected val helper: ServiceImplTestHelper = ServiceImplTestHelper()) : EasyMockSupport()
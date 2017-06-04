package com.excref.kotblog.service.test.helper

import com.excref.kotblog.domain.tag.Tag
import java.util.*

/**
 * @author Arthur Asatryan
 * @since 6/4/17 4:30 PM
 */
class ServiceImplTestHelper {
    //region Public methods
    fun buildTag(): Tag = buildTag(UUID.randomUUID().toString())

    fun buildTag(name: String): Tag = Tag(name)
    //endregion
}
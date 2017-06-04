package com.excref.kotblog.service.test.helper

import com.excref.kotblog.domain.tag.Tag
import com.excref.kotblog.service.tag.TagService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

/**
 * @author Arthur Asatryan
 * @since 6/4/17 4:31 PM
 */
@Component
class ServiceIntegrationTestHelper {

    //region Dependencies
    @Autowired
    private lateinit var tagService: TagService
    //endregion

    //region Public methods
    fun persistTag(): Tag {
        return persistTag(UUID.randomUUID().toString())
    }

    fun persistTag(name: String): Tag {
        return tagService.create(name)
    }
    //endregion
}
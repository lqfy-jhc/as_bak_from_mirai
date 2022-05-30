/*
 * Copyright 2019-2022 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/dev/LICENSE
 */


package net.mamoe.mirai.contact

import net.mamoe.mirai.contact.file.RemoteFiles
import net.mamoe.mirai.utils.NotStableForInheritance

/**
 * 支持文件操作的 [Contact]. 目前仅 [Group].
 *
 * 获取文件操作相关示例: [RemoteFiles]
 *
 * @since 2.5
 *
 * @see RemoteFiles
 */
@NotStableForInheritance
public expect interface FileSupported : Contact {
    /**
     * 获取远程文件列表 (管理器).
     *
     * @since 2.8
     */
    public val files: RemoteFiles
}
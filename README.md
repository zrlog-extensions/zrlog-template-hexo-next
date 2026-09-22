# zrlog-template-hexo-next

独立的 ZrLog 内置主题资源 JAR，通过 Java ServiceLoader 注册，不属于主题市场索引。

Maven 坐标：`com.hibegin:zrlog-template-hexo-next:8.27.0`。主题 id 与包内路径保持 `hexo-theme-next`、`include/templates/hexo-theme-next/`。版本以 package.json 为准；上游许可证与来源保留在资源目录。

先构建 zrlog-template-spi，再运行 `./mvnw verify` 或 `./mvnw install`。部署应用引入 JAR 即可发现主题，无需运行时下载或复制源码。

构建由 SPI 工具自动生成资源索引、Native Image resource-config.json 与 provider 构造器反射注册，勿手工维护资源清单。

发布到 Maven Central：配置现有 OSSRH_USERNAME、OSSRH_PASSWORD、GPG_PRIVATE_KEY、GPG_PASSPHRASE 后推送匹配版本的 tag。先发布 SPI，再发布主题。

这是上游 Hexo 主题的 ZrLog 适配制品，并非上游官方 Maven 发布。上游：git+https://github.com/next-theme/hexo-theme-next.git；许可证：AGPL-3.0-only。原始 package.json 与许可证保留在资源目录。

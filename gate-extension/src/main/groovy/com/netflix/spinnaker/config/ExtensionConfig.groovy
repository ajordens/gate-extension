package com.netflix.spinnaker.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(["com.netflix.spinnaker.internal"])
class ExtensionConfig {

}

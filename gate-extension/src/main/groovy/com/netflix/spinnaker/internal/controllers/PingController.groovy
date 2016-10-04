package com.netflix.spinnaker.internal.controllers

import groovy.transform.CompileStatic
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RequestMapping("/ping")
@RestController
class PingController {
  @RequestMapping(method = RequestMethod.GET)
  String ping() {
    return "pong"
  }
}

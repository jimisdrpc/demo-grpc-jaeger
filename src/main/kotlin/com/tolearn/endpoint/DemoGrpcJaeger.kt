package com.tolearn.endpoint

import com.tolearn.DemoGrpcJaegerReply
import com.tolearn.DemoGrpcJaegerRequest
import com.tolearn.DemoGrpcJaegerServiceGrpcKt
import javax.inject.Singleton

@Singleton
class DemoGrpcJaeger : DemoGrpcJaegerServiceGrpcKt.DemoGrpcJaegerServiceCoroutineImplBase(){

    override suspend fun send(request: DemoGrpcJaegerRequest): DemoGrpcJaegerReply {
        return super.send(request)
    }
}
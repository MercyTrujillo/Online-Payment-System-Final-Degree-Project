package com.payment.UsersProject.entities;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class CustomIdGenerator implements IdentifierGenerator {

    private static final AtomicInteger counter = new AtomicInteger(81223453);

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        return counter.getAndIncrement();
    }
    }



package com.globant.proyecto5scopes.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class EjemploScopeService {
}
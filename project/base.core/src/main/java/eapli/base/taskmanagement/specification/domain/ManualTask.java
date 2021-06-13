/*
 * Copyright (c) 2013-2019 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.base.taskmanagement.specification.domain;

import eapli.base.formmanagement.domain.Form;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
public class ManualTask extends Task{

    @OneToOne()
    @JoinColumn(name = "formID")
    private Form m_oForm;



    public ManualTask(final TaskDescription oDescription, final TaskPriority oTaskPriority, Form oForm) {
        super(oDescription, oTaskPriority);
        if (oForm == null) {
            throw new IllegalArgumentException();
        }
        this.m_oForm = oForm;
    }

    protected ManualTask() {
        // for ORM only
    }

    public Form form() {
        return this.m_oForm;
    }



    @Override
    public int hashCode() {
        return this.m_oForm.hashCode();
    }

    @Override
    public String toString() {
        return "Manual Task #" + this.id() + ": " + this.description() + " | Form: " + this.m_oForm.name();
    }
}

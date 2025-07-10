package model;

/*
 * Abstract class representing a generic instruction in the pipeline simulator.
 * This class serves as a base for specific instruction types such as R-type, I-type,
 * memory, and branch instructions.
 */
public abstract class Instruction {
    protected String text;
    protected String opcode;
    protected String rd;
    protected String rs;
    protected String rt;
    protected String imm;
    protected int address;

    public Instruction(String text, String opcode, String rd, String rs, String rt, String imm, int address) {
        this.text = text;
        this.opcode = opcode;
        this.rd = rd;
        this.rs = rs;
        this.rt = rt;
        this.imm = imm;
        this.address = address;
    }

    // Abstract methods that each type of instruction must implement
    public abstract void execute(RegisterFile registers, DataMemory memory, PipelineRegisters pipelineRegs);
    public abstract boolean isMemoryInstruction();
    public abstract boolean isBranchInstruction();
    public abstract boolean usesRS();
    public abstract boolean usesRT();
    public abstract boolean writesRD();

    // Getters
    public String getText() { return text; }
    public String getOpcode() { return opcode; }
    public String getRd() { return rd; }
    public String getRs() { return rs; }
    public String getRt() { return rt; }
    public String getImm() { return imm; }
    public int getAddress() { return address; }

    @Override
    public String toString() {
        return text;
    }
}

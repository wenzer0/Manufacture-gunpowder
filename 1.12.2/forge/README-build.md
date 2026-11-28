# 1.12.2 Forge build notes

Built by compiling a single class against lightweight stubs (`javac --release 8`),
SRG field names verified against MCP stable 39 mappings:
`field_151044_h` = Items.COAL (input, meta 0 = coal / meta 1 = charcoal),
`field_151016_H` = Items.GUNPOWDER (output). Smelting only — blast furnace does
not exist on 1.12.2. See repo root `build_1122.py` in the local workspace for
the full stub-compilation build script.

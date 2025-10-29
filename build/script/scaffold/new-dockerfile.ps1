# ============= new-service.ps1 =============

# 该PowerShell脚本用于生成新的Dockerfile，创建目录结构、复制模板、修改内容等

#                命令格式:     .\new-dockerfile.ps1 <service_name>
# 示例用法(生成一个user服务):    .\new-dockerfile.ps1 user

# 注意事项：
# 1. 在运行脚本之前，请先启用系统长路径支持（具体操作可百度或询问AI）
# 2. 请使用PowerShell 7 或更高版本运行此脚本！